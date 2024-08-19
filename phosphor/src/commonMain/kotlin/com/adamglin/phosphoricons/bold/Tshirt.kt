package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.17f, 57.9f)
                lineTo(198.09f, 29.65f)
                horizontalLineToRelative(0.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 192.0f, 28.0f)
                lineTo(160.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -6.07f, 1.66f)
                horizontalLineToRelative(0.0f)
                lineTo(9.83f, 57.9f)
                arcTo(20.18f, 20.18f, 0.0f, false, false, 2.0f, 84.0f)
                lineToRelative(17.9f, 36.8f)
                arcTo(19.62f, 19.62f, 0.0f, false, false, 37.67f, 132.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 132.0f)
                horizontalLineToRelative(14.32f)
                arcToRelative(19.64f, 19.64f, 0.0f, false, false, 17.75f, -11.17f)
                lineTo(254.0f, 84.0f)
                arcTo(20.18f, 20.18f, 0.0f, false, false, 246.17f, 57.9f)
                close()
                moveTo(40.37f, 108.0f)
                lineTo(25.16f, 76.73f)
                lineTo(52.0f, 61.0f)
                verticalLineToRelative(47.0f)
                close()
                moveTo(180.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                lineTo(76.0f, 52.0f)
                horizontalLineToRelative(9.67f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.68f, 0.0f)
                lineTo(180.0f, 52.0f)
                close()
                moveTo(215.62f, 108.0f)
                lineTo(204.0f, 108.0f)
                lineTo(204.0f, 61.0f)
                lineToRelative(26.83f, 15.76f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
