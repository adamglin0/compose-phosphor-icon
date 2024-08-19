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

public val BoldGroup.Stairs: ImageVector
    get() {
        if (_stairs != null) {
            return _stairs!!
        }
        _stairs = Builder(name = "Stairs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(152.0f, 148.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(16.0f)
                lineTo(116.0f, 164.0f)
                lineTo(116.0f, 148.0f)
                close()
                moveTo(164.0f, 124.0f)
                lineTo(164.0f, 108.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(196.0f, 44.0f)
                lineTo(196.0f, 84.0f)
                lineTo(152.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                lineTo(104.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                lineTo(60.0f, 164.0f)
                lineTo(60.0f, 44.0f)
                close()
                moveTo(60.0f, 212.0f)
                lineTo(60.0f, 188.0f)
                lineTo(196.0f, 188.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _stairs!!
    }

private var _stairs: ImageVector? = null
