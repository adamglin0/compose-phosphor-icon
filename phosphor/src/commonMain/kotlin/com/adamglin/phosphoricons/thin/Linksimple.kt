package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Linksimple: ImageVector
    get() {
        if (_linksimple != null) {
            return _linksimple!!
        }
        _linksimple = Builder(name = "Linksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.84f, 93.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(64.0f, -64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 162.84f, 93.16f)
                close()
                moveTo(212.79f, 43.21f)
                arcToRelative(52.07f, 52.07f, 0.0f, false, false, -73.56f, 0.0f)
                lineTo(109.17f, 73.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 5.66f)
                lineToRelative(30.07f, -30.06f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.24f, 62.24f)
                lineToRelative(-30.07f, 30.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(30.07f, -30.06f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 212.79f, 43.21f)
                close()
                moveTo(141.17f, 177.06f)
                lineToRelative(-30.06f, 30.07f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -62.24f, -62.24f)
                lineToRelative(30.06f, -30.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(43.21f, 139.23f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.56f, 73.56f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _linksimple!!
    }

private var _linksimple: ImageVector? = null
