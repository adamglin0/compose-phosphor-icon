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

public val RegularGroup.LightningA: ImageVector
    get() {
        if (_lightningA != null) {
            return _lightningA!!
        }
        _lightningA = Builder(name = "LightningA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.84f, 111.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.56f, -5.7f)
                lineToRelative(-50.0f, -22.43f)
                lineTo(135.0f, 25.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.65f, -7.28f)
                lineTo(26.13f, 121.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.59f, 12.73f)
                lineToRelative(50.0f, 22.44f)
                lineTo(65.0f, 214.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.65f, 7.28f)
                lineToRelative(95.2f, -102.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 175.84f, 111.54f)
                close()
                moveTo(87.62f, 188.21f)
                lineToRelative(8.16f, -34.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.5f, -9.15f)
                lineTo(45.43f, 124.12f)
                lineToRelative(66.95f, -72.33f)
                lineToRelative(-8.16f, 34.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.5f, 9.15f)
                lineToRelative(45.84f, 20.58f)
                close()
                moveTo(239.15f, 212.42f)
                lineTo(203.15f, 140.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, 0.0f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.31f, 7.16f)
                lineTo(176.94f, 200.0f)
                horizontalLineToRelative(38.11f)
                lineToRelative(9.79f, 19.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, -11.58f)
                close()
                moveTo(184.94f, 184.0f)
                lineTo(196.0f, 161.89f)
                lineTo(207.05f, 184.0f)
                close()
            }
        }
        .build()
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
