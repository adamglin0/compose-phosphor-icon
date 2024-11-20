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

public val ThinGroup.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) {
            return _truckTrailer!!
        }
        _truckTrailer = Builder(name = "TruckTrailer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 100.22f)
                lineTo(220.0f, 96.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(148.0f, 180.0f)
                lineTo(124.0f, 180.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(16.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 80.0f)
                lineTo(4.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 52.0f, 14.41f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 107.71f, 188.0f)
                horizontalLineToRelative(88.58f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 252.0f, 184.0f)
                lineTo(252.0f, 136.0f)
                arcTo(36.06f, 36.06f, 0.0f, false, false, 220.0f, 100.22f)
                close()
                moveTo(12.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(116.0f, 76.0f)
                lineTo(116.0f, 180.0f)
                horizontalLineToRelative(-8.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 56.0f, 169.59f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -44.0f, -5.16f)
                close()
                moveTo(32.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 204.0f)
                close()
                moveTo(80.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 204.0f)
                close()
                moveTo(224.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 224.0f, 204.0f)
                close()
                moveTo(224.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.71f, 24.0f)
                lineTo(156.0f, 180.0f)
                lineTo(156.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(28.43f)
                arcTo(27.9f, 27.9f, 0.0f, false, false, 224.0f, 156.0f)
                close()
            }
        }
        .build()
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
