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

public val BoldGroup.CraneTower: ImageVector
    get() {
        if (_craneTower != null) {
            return _craneTower!!
        }
        _craneTower = Builder(name = "CraneTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 76.0f)
                lineTo(111.42f, 76.0f)
                lineTo(90.73f, 34.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 76.0f)
                lineTo(24.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.0f, 100.0f)
                lineTo(36.0f, 204.0f)
                lineTo(24.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(128.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(116.0f, 204.0f)
                lineTo(116.0f, 100.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(80.0f)
                lineTo(192.0f, 180.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 100.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(60.0f, 52.0f)
                lineTo(72.58f, 52.0f)
                lineToRelative(12.0f, 24.0f)
                lineTo(60.0f, 76.0f)
                close()
                moveTo(60.0f, 204.0f)
                lineTo(60.0f, 164.0f)
                lineTo(92.0f, 164.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(92.0f, 140.0f)
                lineTo(60.0f, 140.0f)
                lineTo(60.0f, 100.0f)
                lineTo(92.0f, 100.0f)
                close()
            }
        }
        .build()
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
