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

public val FillGroup.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) {
            return _stackOverflowLogo!!
        }
        _stackOverflowLogo = Builder(name = "StackOverflowLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(134.86f, 46.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(45.25f, 45.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 11.31f)
                lineTo(134.86f, 58.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 134.86f, 46.86f)
                close()
                moveTo(100.18f, 98.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.45f, -4.33f)
                lineToRelative(59.13f, 24.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.06f, 15.4f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -3.06f, -0.62f)
                lineToRelative(-59.13f, -24.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.18f, 98.77f)
                close()
                moveTo(96.0f, 152.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(200.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(56.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                lineTo(184.0f, 184.0f)
                lineTo(184.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
