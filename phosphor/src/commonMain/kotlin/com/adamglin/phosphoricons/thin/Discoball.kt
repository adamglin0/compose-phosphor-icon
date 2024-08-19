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

public val ThinGroup.Discoball: ImageVector
    get() {
        if (_discoball != null) {
            return _discoball!!
        }
        _discoball = Builder(name = "Discoball", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 68.1f)
                lineTo(116.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(108.0f, 68.1f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(187.89f, 148.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-1.0f, -37.34f, -15.73f, -60.22f, -25.35f, -71.25f)
                arcTo(76.12f, 76.12f, 0.0f, false, true, 187.89f, 148.0f)
                close()
                moveTo(112.0f, 226.68f)
                curveTo(105.0f, 220.0f, 85.26f, 197.61f, 84.06f, 156.0f)
                horizontalLineToRelative(55.88f)
                curveTo(138.74f, 197.61f, 119.0f, 220.0f, 112.0f, 226.68f)
                close()
                moveTo(84.06f, 148.0f)
                curveToRelative(1.2f, -41.61f, 21.0f, -64.0f, 27.94f, -70.68f)
                curveToRelative(7.0f, 6.64f, 26.74f, 29.07f, 27.94f, 70.68f)
                close()
                moveTo(101.42f, 76.75f)
                curveToRelative(-9.62f, 11.0f, -24.35f, 33.91f, -25.35f, 71.25f)
                horizontalLineToRelative(-40.0f)
                arcTo(76.12f, 76.12f, 0.0f, false, true, 101.42f, 76.75f)
                close()
                moveTo(36.11f, 156.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(1.0f, 37.34f, 15.73f, 60.22f, 25.35f, 71.25f)
                arcTo(76.12f, 76.12f, 0.0f, false, true, 36.11f, 156.0f)
                close()
                moveTo(122.58f, 227.25f)
                curveToRelative(9.62f, -11.0f, 24.35f, -33.91f, 25.35f, -71.25f)
                horizontalLineToRelative(40.0f)
                arcTo(76.12f, 76.12f, 0.0f, false, true, 122.58f, 227.25f)
                close()
                moveTo(252.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(236.0f, 92.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(228.0f, 92.0f)
                lineTo(216.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(228.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(236.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 88.0f)
                close()
                moveTo(212.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(188.0f, 44.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(180.0f, 44.0f)
                lineTo(160.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(180.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(188.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 40.0f)
                close()
            }
        }
        .build()
        return _discoball!!
    }

private var _discoball: ImageVector? = null
