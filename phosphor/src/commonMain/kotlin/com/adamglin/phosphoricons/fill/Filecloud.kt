package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Filecloud: ImageVector
    get() {
        if (_filecloud != null) {
            return _filecloud!!
        }
        _filecloud = Builder(name = "Filecloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 181.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 51.0f)
                lineTo(60.72f, 232.0f)
                curveTo(40.87f, 232.0f, 24.0f, 215.77f, 24.0f, 195.92f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 19.28f, -31.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.77f, 4.33f)
                arcToRelative(63.53f, 63.53f, 0.0f, false, false, -1.0f, 11.15f)
                arcTo(8.22f, 8.22f, 0.0f, false, false, 55.55f, 188.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 180.0f)
                arcToRelative(47.55f, 47.55f, 0.0f, false, true, 4.37f, -20.0f)
                horizontalLineToRelative(0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 160.0f, 181.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(200.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(188.69f, 80.0f)
                lineTo(160.0f, 51.31f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _filecloud!!
    }

private var _filecloud: ImageVector? = null
