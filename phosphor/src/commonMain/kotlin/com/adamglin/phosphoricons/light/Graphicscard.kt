package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Graphicscard: ImageVector
    get() {
        if (_graphicscard != null) {
            return _graphicscard!!
        }
        _graphicscard = Builder(name = "Graphicscard", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 50.0f)
                lineTo(16.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(10.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(22.0f, 190.0f)
                lineTo(42.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 190.0f)
                lineTo(74.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(86.0f, 190.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(118.0f, 190.0f)
                lineTo(232.0f, 190.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 50.0f)
                close()
                moveTo(234.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(22.0f, 178.0f)
                lineTo(22.0f, 62.0f)
                lineTo(232.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(176.0f, 82.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 176.0f, 82.0f)
                close()
                moveTo(202.0f, 120.0f)
                arcToRelative(25.81f, 25.81f, 0.0f, false, true, -3.88f, 13.64f)
                lineTo(162.36f, 97.88f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 202.0f, 120.0f)
                close()
                moveTo(150.0f, 120.0f)
                arcToRelative(25.81f, 25.81f, 0.0f, false, true, 3.88f, -13.64f)
                lineToRelative(35.76f, 35.76f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 150.0f, 120.0f)
                close()
                moveTo(80.0f, 82.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 80.0f, 82.0f)
                close()
                moveTo(106.0f, 120.0f)
                arcToRelative(25.81f, 25.81f, 0.0f, false, true, -3.88f, 13.64f)
                lineTo(66.36f, 97.88f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 106.0f, 120.0f)
                close()
                moveTo(54.0f, 120.0f)
                arcToRelative(25.81f, 25.81f, 0.0f, false, true, 3.88f, -13.64f)
                lineToRelative(35.76f, 35.76f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 54.0f, 120.0f)
                close()
            }
        }
        .build()
        return _graphicscard!!
    }

private var _graphicscard: ImageVector? = null
