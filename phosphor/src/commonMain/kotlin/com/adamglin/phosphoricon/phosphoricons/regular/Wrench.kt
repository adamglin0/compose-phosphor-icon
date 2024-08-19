package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.76f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.84f, -2.88f)
                lineToRelative(-40.3f, 37.19f)
                lineToRelative(-17.23f, -3.7f)
                lineToRelative(-3.7f, -17.23f)
                lineToRelative(37.19f, -40.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 187.0f, 29.24f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 96.0f)
                arcTo(72.34f, 72.34f, 0.0f, false, false, 94.0f, 124.94f)
                lineTo(33.79f, 177.0f)
                curveToRelative(-0.15f, 0.12f, -0.29f, 0.26f, -0.43f, 0.39f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f)
                curveToRelative(0.13f, -0.13f, 0.27f, -0.28f, 0.39f, -0.42f)
                lineTo(131.06f, 162.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 232.0f, 96.0f)
                arcTo(71.56f, 71.56f, 0.0f, false, false, 226.76f, 69.0f)
                close()
                moveTo(160.0f, 152.0f)
                arcToRelative(56.14f, 56.14f, 0.0f, false, true, -27.07f, -7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.92f, 1.77f)
                lineTo(67.11f, 211.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f)
                lineTo(109.18f, 133.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.77f, -9.93f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 58.36f, -82.31f)
                lineToRelative(-31.2f, 33.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.94f, 7.1f)
                lineTo(141.83f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.14f, 6.14f)
                lineToRelative(26.35f, 5.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -1.94f)
                lineToRelative(33.81f, -31.2f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 160.0f, 152.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
