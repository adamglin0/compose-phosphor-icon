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

public val RegularGroup.FourK: ImageVector
    get() {
        if (_fourK != null) {
            return _fourK!!
        }
        _fourK = Builder(name = "FourK", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(224.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 48.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 147.0f)
                lineToRelative(13.09f, -15.0f)
                lineToRelative(28.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 206.91f, 172.0f)
                lineToRelative(-30.7f, -52.63f)
                lineTo(206.0f, 85.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, -10.54f)
                lineToRelative(-42.0f, 48.0f)
                lineTo(152.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 72.0f)
                close()
                moveTo(88.0f, 176.0f)
                lineTo(88.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.31f, -12.91f)
                lineToRelative(56.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 80.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(88.0f, 144.0f)
                lineTo(88.0f, 103.32f)
                lineTo(56.36f, 144.0f)
                close()
            }
        }
        .build()
        return _fourK!!
    }

private var _fourK: ImageVector? = null
