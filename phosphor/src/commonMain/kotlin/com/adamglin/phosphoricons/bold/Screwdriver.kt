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

public val BoldGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.49f, 47.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(52.0f, -52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.49f, 47.49f)
                close()
                moveTo(252.0f, 58.41f)
                arcTo(54.09f, 54.09f, 0.0f, false, true, 236.06f, 96.9f)
                lineToRelative(-53.23f, 53.23f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 168.69f, 156.0f)
                lineTo(156.0f, 156.0f)
                verticalLineToRelative(12.83f)
                arcToRelative(20.13f, 20.13f, 0.0f, false, true, -4.06f, 12.08f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, -1.08f, 1.23f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                lineTo(98.7f, 174.26f)
                lineTo(24.49f, 248.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineToRelative(74.22f, -74.22f)
                lineTo(65.86f, 141.41f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.29f)
                lineToRelative(8.0f, -8.0f)
                arcTo(11.56f, 11.56f, 0.0f, false, true, 75.1f, 104.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, true, 87.17f, 100.0f)
                lineTo(100.0f, 100.0f)
                lineTo(100.0f, 87.3f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, 5.86f, -14.15f)
                lineToRelative(53.23f, -53.23f)
                arcTo(54.43f, 54.43f, 0.0f, false, true, 252.0f, 58.41f)
                close()
                moveTo(228.0f, 58.41f)
                arcToRelative(30.43f, 30.43f, 0.0f, false, false, -51.94f, -21.52f)
                lineTo(124.0f, 89.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(88.94f, 124.0f)
                lineToRelative(-3.28f, 3.28f)
                lineToRelative(21.52f, 21.53f)
                horizontalLineToRelative(0.0f)
                lineToRelative(21.53f, 21.52f)
                lineToRelative(3.28f, -3.28f)
                lineTo(131.99f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(15.0f)
                lineToRelative(52.06f, -52.07f)
                arcTo(30.24f, 30.24f, 0.0f, false, false, 228.0f, 58.41f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
