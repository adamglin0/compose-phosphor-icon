package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Arrowfatleft: ImageVector
    get() {
        if (_arrowfatleft != null) {
            return _arrowfatleft!!
        }
        _arrowfatleft = Builder(name = "Arrowfatleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 74.0f)
                lineTo(126.0f, 74.0f)
                lineTo(126.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.24f, -4.24f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(96.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 126.0f, 224.0f)
                lineTo(126.0f, 182.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 74.0f)
                close()
                moveTo(210.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(120.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.51f)
                lineTo(32.49f, 128.0f)
                lineTo(114.0f, 46.49f)
                lineTo(114.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowfatleft!!
    }

private var _arrowfatleft: ImageVector? = null
