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

public val LightGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 34.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(58.0f)
                lineTo(53.52f, 106.0f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 16.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 78.0f, 78.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 0.0f, -156.0f)
                close()
                moveTo(225.71f, 106.0f)
                lineTo(161.1f, 106.0f)
                lineToRelative(47.82f, -38.25f)
                arcTo(65.66f, 65.66f, 0.0f, false, true, 225.71f, 106.0f)
                close()
                moveTo(152.0f, 46.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(65.67f, 65.67f, 0.0f, false, true, 40.0f, 13.53f)
                lineToRelative(-50.0f, 40.0f)
                lineTo(150.0f, 48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 152.0f, 46.0f)
                close()
                moveTo(160.0f, 178.0f)
                lineTo(120.0f, 178.0f)
                arcToRelative(66.09f, 66.09f, 0.0f, false, true, -65.73f, -60.0f)
                lineTo(225.73f, 118.0f)
                arcTo(66.09f, 66.09f, 0.0f, false, true, 160.0f, 178.0f)
                close()
                moveTo(102.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 102.0f, 224.0f)
                close()
                moveTo(206.0f, 224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 224.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
