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

public val FillGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 144.0f)
                verticalLineToRelative(51.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, -1.43f, -0.13f)
                lineToRelative(-64.0f, -11.64f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 184.0f)
                lineTo(24.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(96.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 144.0f)
                close()
                moveTo(101.13f, 54.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.56f, -1.73f)
                lineToRelative(-64.0f, 11.64f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(96.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 60.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 101.13f, 54.22f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(57.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.57f, 7.88f)
                lineToRelative(80.0f, 14.54f)
                arcTo(7.61f, 7.61f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 136.0f)
                close()
                moveTo(213.13f, 33.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.56f, -1.73f)
                lineToRelative(-80.0f, 14.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 54.55f)
                lineTo(120.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.13f, 33.86f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
