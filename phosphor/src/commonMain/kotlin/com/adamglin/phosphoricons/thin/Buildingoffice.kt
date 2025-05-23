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

public val ThinGroup.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) {
            return _buildingOffice!!
        }
        _buildingOffice = Builder(name = "BuildingOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 212.0f)
                lineTo(228.0f, 212.0f)
                lineTo(228.0f, 92.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(180.0f, 84.0f)
                lineTo(180.0f, 44.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(44.0f, 212.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(248.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(220.0f, 92.0f)
                lineTo(220.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                lineTo(180.0f, 92.0f)
                close()
                moveTo(52.0f, 44.0f)
                lineTo(172.0f, 44.0f)
                lineTo(172.0f, 212.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(52.0f)
                lineTo(52.0f, 212.0f)
                close()
                moveTo(132.0f, 212.0f)
                lineTo(92.0f, 212.0f)
                lineTo(92.0f, 164.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(76.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(96.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(80.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.0f, 80.0f)
                close()
                moveTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(128.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 80.0f)
                close()
                moveTo(80.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(124.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(128.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 120.0f)
                close()
            }
        }
        .build()
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
