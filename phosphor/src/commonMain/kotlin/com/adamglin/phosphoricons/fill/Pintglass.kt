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

public val FillGroup.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) {
            return _pintGlass!!
        }
        _pintGlass = Builder(name = "PintGlass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 26.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 24.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 9.0f)
                lineToRelative(23.15f, 193.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 87.1f, 240.0f)
                horizontalLineToRelative(81.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.89f, -14.09f)
                lineTo(207.94f, 33.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 206.0f, 26.69f)
                close()
                moveTo(191.0f, 40.0f)
                lineTo(188.1f, 64.0f)
                horizontalLineTo(67.9f)
                lineTo(65.0f, 40.0f)
                close()
            }
        }
        .build()
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
