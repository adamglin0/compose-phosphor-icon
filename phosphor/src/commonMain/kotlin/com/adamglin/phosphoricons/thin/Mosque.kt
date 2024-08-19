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

public val ThinGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 132.0f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -12.0f, 4.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -39.63f, -28.82f, -58.82f, -52.0f, -74.23f)
                curveToRelative(-15.0f, -10.0f, -28.0f, -18.66f, -28.0f, -29.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                curveToRelative(0.0f, 11.11f, -13.0f, 19.76f, -28.0f, 29.77f)
                curveTo(72.82f, 69.18f, 44.0f, 88.37f, 44.0f, 128.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -32.0f, 16.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(80.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(84.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(148.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(244.0f, 152.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 132.0f)
                close()
                moveTo(100.41f, 60.43f)
                curveTo(112.0f, 52.71f, 122.51f, 45.71f, 128.0f, 37.14f)
                curveToRelative(5.49f, 8.57f, 16.0f, 15.57f, 27.59f, 23.29f)
                curveTo(177.41f, 75.0f, 202.0f, 91.34f, 203.87f, 124.0f)
                lineTo(52.13f, 124.0f)
                curveTo(54.0f, 91.34f, 78.59f, 75.0f, 100.41f, 60.43f)
                close()
                moveTo(20.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(52.0f)
                lineTo(20.0f, 204.0f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(28.0f)
                lineTo(116.0f, 204.0f)
                lineTo(116.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 132.0f)
                lineTo(204.0f, 132.0f)
                verticalLineToRelative(72.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 160.0f, 156.0f)
                close()
                moveTo(236.0f, 204.0f)
                lineTo(212.0f, 204.0f)
                lineTo(212.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
