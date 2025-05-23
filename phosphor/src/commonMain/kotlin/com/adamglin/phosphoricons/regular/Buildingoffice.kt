package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) {
            return _buildingOffice!!
        }
        _buildingOffice = Builder(name = "BuildingOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 208.0f)
                lineTo(232.0f, 208.0f)
                lineTo(232.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(184.0f, 80.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(40.0f, 208.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(248.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(216.0f, 96.0f)
                lineTo(216.0f, 208.0f)
                lineTo(184.0f, 208.0f)
                lineTo(184.0f, 96.0f)
                close()
                moveTo(56.0f, 48.0f)
                lineTo(168.0f, 48.0f)
                lineTo(168.0f, 208.0f)
                lineTo(144.0f, 208.0f)
                lineTo(144.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(88.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                lineTo(56.0f, 208.0f)
                close()
                moveTo(128.0f, 208.0f)
                lineTo(96.0f, 208.0f)
                lineTo(96.0f, 168.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(72.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 80.0f)
                close()
                moveTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(128.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 80.0f)
                close()
                moveTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 120.0f)
                close()
                moveTo(120.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(128.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 120.0f)
                close()
            }
        }
        .build()
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
