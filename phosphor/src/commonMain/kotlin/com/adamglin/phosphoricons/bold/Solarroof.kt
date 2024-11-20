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

public val BoldGroup.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) {
            return _solarRoof!!
        }
        _solarRoof = Builder(name = "SolarRoof", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.73f, 122.63f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.73f, 6.63f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 250.73f, 122.63f)
                close()
                moveTo(96.58f, 60.0f)
                lineToRelative(8.0f, 16.0f)
                lineTo(83.42f, 76.0f)
                lineToRelative(-8.0f, -16.0f)
                close()
                moveTo(144.58f, 60.0f)
                lineTo(152.58f, 76.0f)
                lineTo(131.42f, 76.0f)
                lineToRelative(-8.0f, -16.0f)
                close()
                moveTo(103.42f, 116.0f)
                lineTo(95.42f, 100.0f)
                horizontalLineToRelative(21.16f)
                lineToRelative(8.0f, 16.0f)
                close()
                moveTo(151.42f, 116.0f)
                lineTo(143.42f, 100.0f)
                horizontalLineToRelative(21.16f)
                lineToRelative(8.0f, 16.0f)
                close()
                moveTo(199.42f, 116.0f)
                lineTo(191.42f, 100.0f)
                horizontalLineToRelative(21.16f)
                lineToRelative(8.0f, 16.0f)
                close()
                moveTo(200.58f, 76.0f)
                lineTo(179.42f, 76.0f)
                lineToRelative(-8.0f, -16.0f)
                horizontalLineToRelative(21.16f)
                close()
                moveTo(28.0f, 130.83f)
                lineToRelative(28.0f, -56.0f)
                lineToRelative(28.0f, 56.0f)
                lineTo(84.0f, 180.0f)
                lineTo(28.0f, 180.0f)
                close()
                moveTo(108.0f, 180.0f)
                lineTo(108.0f, 140.0f)
                lineTo(228.0f, 140.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
