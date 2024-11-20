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

public val ThinGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.84f, 85.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.84f, 85.17f)
                close()
                moveTo(213.59f, 112.08f)
                lineTo(112.08f, 213.57f)
                arcToRelative(49.26f, 49.26f, 0.0f, false, true, -69.67f, -69.65f)
                lineTo(143.92f, 42.43f)
                arcToRelative(49.26f, 49.26f, 0.0f, false, true, 69.67f, 69.65f)
                close()
                moveTo(154.35f, 160.0f)
                lineTo(96.0f, 101.66f)
                lineTo(48.06f, 149.57f)
                arcToRelative(41.26f, 41.26f, 0.0f, false, false, 58.36f, 58.35f)
                close()
                moveTo(207.94f, 48.08f)
                arcToRelative(41.28f, 41.28f, 0.0f, false, false, -58.36f, 0.0f)
                lineTo(101.65f, 96.0f)
                lineTo(160.0f, 154.34f)
                lineToRelative(47.93f, -47.91f)
                arcTo(41.32f, 41.32f, 0.0f, false, false, 207.94f, 48.08f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
