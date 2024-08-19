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

public val BoldGroup.Securitycamera: ImageVector
    get() {
        if (_securitycamera != null) {
            return _securitycamera!!
        }
        _securitycamera = Builder(name = "Securitycamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(197.0f)
                lineToRelative(-14.35f, -14.34f)
                lineToRelative(47.52f, -47.52f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.28f)
                lineToRelative(-56.0f, -56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.32f, 0.0f)
                lineTo(6.42f, 150.47f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 22.0f, 188.0f)
                horizontalLineToRelative(33.7f)
                lineToRelative(26.14f, 26.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(55.51f, -55.51f)
                lineToRelative(15.52f, 15.51f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 195.31f, 180.0f)
                horizontalLineTo(232.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 132.0f)
                close()
                moveTo(160.0f, 29.67f)
                lineToRelative(15.0f, 15.0f)
                lineTo(55.71f, 164.0f)
                horizontalLineTo(26.81f)
                close()
                moveTo(96.0f, 194.34f)
                lineTo(77.65f, 176.0f)
                lineTo(192.0f, 61.66f)
                lineTo(210.34f, 80.0f)
                lineToRelative(-53.17f, 53.17f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _securitycamera!!
    }

private var _securitycamera: ImageVector? = null
