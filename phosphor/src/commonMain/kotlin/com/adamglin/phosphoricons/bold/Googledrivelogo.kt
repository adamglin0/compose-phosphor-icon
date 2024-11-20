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

public val BoldGroup.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) {
            return _googleDriveLogo!!
        }
        _googleDriveLogo = Builder(name = "GoogleDriveLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 141.65f)
                lineTo(172.59f, 29.51f)
                lineToRelative(-0.07f, -0.11f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, -17.0f, -9.4f)
                lineTo(100.44f, 20.0f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, -17.0f, 9.4f)
                lineToRelative(-0.07f, 0.11f)
                lineTo(15.0f, 141.65f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.36f, 20.46f)
                lineTo(42.0f, 209.92f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 59.33f, 220.0f)
                lineTo(196.67f, 220.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 214.0f, 209.92f)
                lineToRelative(27.32f, -47.81f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 241.0f, 141.65f)
                close()
                moveTo(211.88f, 140.0f)
                lineTo(174.79f, 140.0f)
                lineTo(142.0f, 85.33f)
                lineToRelative(18.12f, -30.19f)
                close()
                moveTo(54.8f, 184.0f)
                lineTo(43.36f, 164.0f)
                lineTo(66.81f, 164.0f)
                close()
                moveTo(94.8f, 164.0f)
                horizontalLineToRelative(66.4f)
                lineToRelative(19.2f, 32.0f)
                lineTo(75.6f, 196.0f)
                close()
                moveTo(109.2f, 140.0f)
                lineTo(128.0f, 108.66f)
                lineTo(146.8f, 140.0f)
                close()
                moveTo(189.2f, 164.0f)
                horizontalLineToRelative(23.45f)
                lineTo(201.2f, 184.0f)
                close()
                moveTo(128.0f, 62.0f)
                lineTo(117.19f, 44.0f)
                horizontalLineToRelative(21.62f)
                close()
                moveTo(95.89f, 55.14f)
                lineTo(114.0f, 85.33f)
                lineTo(81.21f, 140.0f)
                lineTo(44.12f, 140.0f)
                close()
            }
        }
        .build()
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
