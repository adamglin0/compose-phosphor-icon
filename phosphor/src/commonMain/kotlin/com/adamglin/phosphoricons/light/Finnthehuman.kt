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

public val LightGroup.Finnthehuman: ImageVector
    get() {
        if (_finnthehuman != null) {
            return _finnthehuman!!
        }
        _finnthehuman = Builder(name = "Finnthehuman", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 106.0f)
                lineTo(88.0f, 106.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                verticalLineToRelative(-8.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 168.0f, 106.0f)
                close()
                moveTo(194.0f, 152.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(88.0f, 178.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(208.0f, 42.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -29.4f, 24.0f)
                lineTo(77.4f, 66.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 18.0f, 72.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, 70.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f)
                lineTo(238.0f, 72.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(226.0f, 152.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, 58.0f)
                lineTo(88.0f, 210.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, -58.0f)
                lineTo(30.0f, 72.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(184.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                close()
                moveTo(102.0f, 148.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 148.0f)
                close()
                moveTo(174.0f, 148.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 148.0f)
                close()
            }
        }
        .build()
        return _finnthehuman!!
    }

private var _finnthehuman: ImageVector? = null
