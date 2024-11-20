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

public val BoldGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.45f, 44.51f)
                lineTo(170.07f, 29.7f)
                lineTo(185.0f, 22.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 175.0f, 1.08f)
                lineToRelative(-41.78f, 19.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 52.0f, 104.0f)
                lineTo(52.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(76.0f, 180.0f)
                lineTo(92.0f, 180.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(44.08f, 44.08f, 0.0f, false, false, -32.0f, -42.32f)
                lineTo(148.0f, 48.13f)
                lineTo(212.55f, 67.5f)
                arcTo(11.81f, 11.81f, 0.0f, false, false, 216.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.45f, -23.49f)
                close()
                moveTo(76.0f, 156.0f)
                lineTo(76.0f, 104.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, 48.0f, -58.79f)
                lineTo(124.0f, 61.68f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 92.0f, 104.0f)
                verticalLineToRelative(52.0f)
                close()
                moveTo(116.0f, 228.0f)
                lineTo(116.0f, 180.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(156.0f, 104.0f)
                verticalLineToRelative(52.0f)
                lineTo(116.0f, 156.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
