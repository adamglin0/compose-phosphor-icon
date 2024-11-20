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

public val RegularGroup.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) {
            return _readCvLogo!!
        }
        _readCvLogo = Builder(name = "ReadCvLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.78f, 39.25f)
                lineToRelative(-130.25f, -23.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 62.0f, 29.23f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.0f, 18.53f)
                lineToRelative(130.25f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.54f, -13.0f)
                lineToRelative(29.75f, -169.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 210.78f, 39.25f)
                close()
                moveTo(178.26f, 224.0f)
                horizontalLineToRelative(0.0f)
                lineTo(48.0f, 201.0f)
                lineTo(77.75f, 32.0f)
                lineTo(208.0f, 55.0f)
                close()
                moveTo(89.34f, 58.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.27f, -6.48f)
                lineToRelative(83.0f, 14.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.39f, 15.88f)
                arcToRelative(8.36f, 8.36f, 0.0f, false, true, -1.4f, -0.12f)
                lineToRelative(-83.0f, -14.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 89.34f, 58.42f)
                close()
                moveTo(83.8f, 89.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.27f, -6.49f)
                lineToRelative(83.0f, 14.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 174.67f, 114.0f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, true, -1.41f, -0.13f)
                lineToRelative(-83.0f, -14.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 83.8f, 89.94f)
                close()
                moveTo(78.25f, 121.45f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 87.52f, 115.0f)
                lineTo(129.0f, 122.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.38f, 15.88f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, -1.4f, -0.12f)
                lineToRelative(-41.5f, -7.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 78.25f, 121.45f)
                close()
            }
        }
        .build()
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
