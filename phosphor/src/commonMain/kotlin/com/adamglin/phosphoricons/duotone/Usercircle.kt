package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Usercircle: ImageVector
    get() {
        if (_usercircle != null) {
            return _usercircle!!
        }
        _usercircle = Builder(name = "Usercircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(95.76f, 95.76f, 0.0f, false, true, -31.8f, 71.37f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -64.2f, 39.37f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(74.08f, 197.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 107.84f, 0.0f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, -107.84f, 0.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(193.76f, 186.41f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, -28.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.4f, 0.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, 28.75f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 131.52f, 0.0f)
                close()
            }
        }
        .build()
        return _usercircle!!
    }

private var _usercircle: ImageVector? = null
