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

public val FillGroup.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, false, -2.3f, 0.34f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 88.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(7.46f)
                curveToRelative(13.45f, 0.0f, 24.79f, 11.0f, 24.54f, 24.46f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 32.0f, 160.0f)
                lineTo(24.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(224.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 88.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(80.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                close()
                moveTo(168.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.0f, -40.0f)
                horizontalLineToRelative(62.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.0f, 40.0f)
                close()
                moveTo(78.51f, 80.0f)
                lineTo(185.12f, 48.0f)
                arcToRelative(40.06f, 40.06f, 0.0f, false, true, 38.07f, 32.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
