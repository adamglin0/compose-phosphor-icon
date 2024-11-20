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

public val LightGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.72f, 50.25f)
                lineTo(152.21f, 30.6f)
                lineToRelative(34.47f, -17.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f)
                lineTo(134.51f, 26.0f)
                arcTo(78.07f, 78.07f, 0.0f, false, false, 58.0f, 104.0f)
                lineTo(58.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 174.0f)
                lineTo(90.0f, 174.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(182.0f, 104.0f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, false, -40.0f, -45.6f)
                lineTo(142.0f, 40.07f)
                lineToRelative(72.27f, 21.68f)
                arcTo(6.14f, 6.14f, 0.0f, false, false, 216.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.72f, -11.75f)
                close()
                moveTo(70.0f, 162.0f)
                lineTo(70.0f, 104.0f)
                arcToRelative(66.07f, 66.07f, 0.0f, false, true, 60.0f, -65.71f)
                lineTo(130.0f, 58.4f)
                arcTo(46.07f, 46.07f, 0.0f, false, false, 90.0f, 104.0f)
                verticalLineToRelative(58.0f)
                close()
                moveTo(168.0f, 234.0f)
                lineTo(104.0f, 234.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(102.0f, 174.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(58.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 168.0f, 234.0f)
                close()
                moveTo(170.0f, 104.0f)
                verticalLineToRelative(58.0f)
                lineTo(102.0f, 162.0f)
                lineTo(102.0f, 104.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
