package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 76.0f)
                close()
                moveTo(164.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 36.0f)
                close()
                moveTo(251.44f, 198.0f)
                lineTo(196.88f, 105.92f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 186.55f, 100.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, -10.32f, 5.88f)
                lineToRelative(-29.61f, 50.0f)
                lineTo(98.34f, 73.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.68f, 0.0f)
                lineTo(4.55f, 198.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 204.0f)
                lineTo(248.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.44f, -6.0f)
                close()
                moveTo(84.55f, 78.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.9f, 0.0f)
                lineToRelative(27.12f, 46.0f)
                lineTo(57.43f, 124.0f)
                close()
                moveTo(15.0f, 196.0f)
                lineToRelative(37.71f, -64.0f)
                horizontalLineToRelative(70.58f)
                lineTo(161.0f, 196.0f)
                close()
                moveTo(170.29f, 196.0f)
                lineTo(151.29f, 163.71f)
                lineTo(183.11f, 110.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.88f, 0.0f)
                lineToRelative(51.0f, 86.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
