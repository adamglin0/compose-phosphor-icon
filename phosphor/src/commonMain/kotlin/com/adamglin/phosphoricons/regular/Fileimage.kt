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

public val RegularGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.66f, 147.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.32f, 0.0f)
                lineTo(76.49f, 178.85f)
                lineToRelative(-9.76f, -15.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.46f, 0.0f)
                lineToRelative(-36.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 232.0f)
                lineTo(152.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.66f, -12.44f)
                close()
                moveTo(38.65f, 216.0f)
                lineTo(60.0f, 182.79f)
                lineToRelative(9.63f, 15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.39f, 0.11f)
                lineToRelative(21.0f, -31.47f)
                lineTo(137.05f, 216.0f)
                close()
                moveTo(213.65f, 82.34f)
                lineTo(157.65f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 216.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(160.0f, 51.31f)
                lineTo(188.69f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
