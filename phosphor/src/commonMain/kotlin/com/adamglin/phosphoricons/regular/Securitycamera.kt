package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Securitycamera: ImageVector
    get() {
        if (_securitycamera != null) {
            return _securitycamera!!
        }
        _securitycamera = Builder(name = "Securitycamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(195.31f)
                lineTo(177.0f, 141.66f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                lineToRelative(-56.0f, -56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(2.92f, 158.94f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 10.0f, 176.0f)
                horizontalLineTo(49.37f)
                lineToRelative(35.32f, 35.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineTo(165.66f, 153.0f)
                lineTo(184.0f, 171.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 195.31f, 176.0f)
                horizontalLineTo(240.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 136.0f)
                close()
                moveTo(160.0f, 24.0f)
                lineToRelative(12.69f, 12.69f)
                lineTo(49.37f, 160.0f)
                horizontalLineTo(24.46f)
                close()
                moveTo(96.0f, 200.0f)
                lineTo(64.0f, 168.0f)
                lineTo(184.0f, 48.0f)
                lineToRelative(32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _securitycamera!!
    }

private var _securitycamera: ImageVector? = null
