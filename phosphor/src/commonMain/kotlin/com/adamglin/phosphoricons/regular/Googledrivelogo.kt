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

public val RegularGroup.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) {
            return _googleDriveLogo!!
        }
        _googleDriveLogo = Builder(name = "GoogleDriveLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 143.78f)
                lineTo(169.13f, 31.52f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 155.56f, 24.0f)
                lineTo(100.43f, 24.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, -13.56f, 7.52f)
                lineToRelative(-0.05f, 0.07f)
                lineTo(18.44f, 143.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.33f, 16.42f)
                lineToRelative(27.32f, 47.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 59.32f, 216.0f)
                lineTo(196.67f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.89f, -8.06f)
                lineToRelative(27.32f, -47.82f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 237.6f, 143.78f)
                close()
                moveTo(219.0f, 144.0f)
                lineTo(172.52f, 144.0f)
                lineTo(137.33f, 85.33f)
                lineToRelative(22.75f, -37.92f)
                close()
                moveTo(102.13f, 144.0f)
                lineTo(128.0f, 100.88f)
                lineTo(153.87f, 144.0f)
                close()
                moveTo(163.47f, 160.0f)
                lineTo(187.47f, 200.0f)
                lineTo(68.53f, 200.0f)
                lineToRelative(24.0f, -40.0f)
                close()
                moveTo(128.0f, 69.78f)
                lineTo(110.12f, 40.0f)
                lineToRelative(35.78f, -0.05f)
                close()
                moveTo(95.91f, 47.41f)
                lineToRelative(22.76f, 37.92f)
                lineTo(83.47f, 144.0f)
                lineTo(37.0f, 144.0f)
                close()
                moveTo(36.54f, 160.0f)
                lineTo(73.87f, 160.0f)
                lineTo(54.72f, 191.92f)
                close()
                moveTo(201.28f, 191.93f)
                lineTo(182.12f, 160.0f)
                horizontalLineToRelative(37.41f)
                close()
            }
        }
        .build()
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
