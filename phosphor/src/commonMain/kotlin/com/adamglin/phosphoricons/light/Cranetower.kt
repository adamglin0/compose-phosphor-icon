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

public val LightGroup.CraneTower: ImageVector
    get() {
        if (_craneTower != null) {
            return _craneTower!!
        }
        _craneTower = Builder(name = "CraneTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 82.0f)
                lineTo(107.71f, 82.0f)
                lineTo(85.37f, 37.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(42.0f, 82.0f)
                lineTo(24.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(42.0f, 94.0f)
                lineTo(42.0f, 210.0f)
                lineTo(24.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(128.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(110.0f, 210.0f)
                lineTo(110.0f, 94.0f)
                lineTo(210.0f, 94.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(192.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 94.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(54.0f, 46.0f)
                lineTo(76.29f, 46.0f)
                lineToRelative(18.0f, 36.0f)
                lineTo(54.0f, 82.0f)
                close()
                moveTo(54.0f, 210.0f)
                lineTo(54.0f, 158.0f)
                lineTo(98.0f, 158.0f)
                verticalLineToRelative(52.0f)
                close()
                moveTo(98.0f, 146.0f)
                lineTo(54.0f, 146.0f)
                lineTo(54.0f, 94.0f)
                lineTo(98.0f, 94.0f)
                close()
            }
        }
        .build()
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
