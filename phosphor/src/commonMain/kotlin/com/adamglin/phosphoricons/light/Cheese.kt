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

public val LightGroup.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 34.0f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -1.72f, 0.25f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(18.09f, 18.09f, 0.0f, false, true, 18.0f, 17.65f)
                arcToRelative(17.59f, 17.59f, 0.0f, false, true, -5.15f, 12.7f)
                arcTo(18.91f, 18.91f, 0.0f, false, true, 31.46f, 154.0f)
                lineTo(24.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(224.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 88.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 184.0f, 34.0f)
                close()
                moveTo(184.85f, 46.0f)
                arcToRelative(42.07f, 42.07f, 0.0f, false, true, 40.72f, 36.0f)
                lineTo(64.88f, 82.0f)
                close()
                moveTo(194.0f, 104.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -50.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcTo(25.87f, 25.87f, 0.0f, false, true, 194.0f, 104.0f)
                close()
                moveTo(138.0f, 186.0f)
                lineTo(86.0f, 186.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                close()
                moveTo(226.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(150.0f, 186.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 186.0f)
                lineTo(30.0f, 166.0f)
                horizontalLineToRelative(1.46f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, false, 22.0f, -9.25f)
                arcTo(29.45f, 29.45f, 0.0f, false, false, 62.0f, 135.42f)
                arcTo(30.14f, 30.14f, 0.0f, false, false, 32.0f, 106.0f)
                lineTo(30.0f, 106.0f)
                lineTo(30.0f, 94.0f)
                lineTo(131.34f, 94.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 73.32f, 0.0f)
                lineTo(226.0f, 94.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
