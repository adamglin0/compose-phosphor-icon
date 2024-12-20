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

public val BoldGroup.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) {
            return _appStoreLogo!!
        }
        _appStoreLogo = Builder(name = "AppStoreLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(200.67f)
                lineToRelative(17.66f, 29.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.66f, 12.21f)
                lineTo(140.9f, 118.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.66f, -12.2f)
                lineTo(186.48f, 148.0f)
                horizontalLineTo(232.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(133.15f, 148.0f)
                horizontalLineTo(97.39f)
                lineTo(162.33f, 38.11f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 141.67f, 25.9f)
                lineTo(128.0f, 49.0f)
                lineTo(114.33f, 25.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 93.67f, 38.11f)
                lineToRelative(20.39f, 34.51f)
                lineTo(69.52f, 148.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(133.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(58.83f, 189.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.43f, 4.22f)
                lineToRelative(-4.73f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 58.33f, 214.1f)
                lineToRelative(4.73f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 58.83f, 189.67f)
                close()
            }
        }
        .build()
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
