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

public val LightGroup.BuildingOffice: ImageVector
    get() {
        if (_buildingOffice != null) {
            return _buildingOffice!!
        }
        _buildingOffice = Builder(name = "BuildingOffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 210.0f)
                lineTo(230.0f, 210.0f)
                lineTo(230.0f, 94.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(182.0f, 82.0f)
                lineTo(182.0f, 46.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(42.0f, 210.0f)
                lineTo(24.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(248.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(218.0f, 94.0f)
                lineTo(218.0f, 210.0f)
                lineTo(182.0f, 210.0f)
                lineTo(182.0f, 94.0f)
                close()
                moveTo(54.0f, 46.0f)
                lineTo(170.0f, 46.0f)
                lineTo(170.0f, 210.0f)
                lineTo(142.0f, 210.0f)
                lineTo(142.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(88.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(50.0f)
                lineTo(54.0f, 210.0f)
                close()
                moveTo(130.0f, 210.0f)
                lineTo(94.0f, 210.0f)
                lineTo(94.0f, 166.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(74.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(96.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(80.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 74.0f, 80.0f)
                close()
                moveTo(122.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(128.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 80.0f)
                close()
                moveTo(80.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(96.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(122.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(128.0f, 126.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 120.0f)
                close()
            }
        }
        .build()
        return _buildingOffice!!
    }

private var _buildingOffice: ImageVector? = null
