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

public val ThinGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 196.0f)
                lineTo(228.0f, 196.0f)
                lineTo(228.0f, 98.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.34f, -10.0f)
                lineTo(134.66f, 30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.32f, 0.0f)
                lineToRelative(-88.0f, 58.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.34f, 10.0f)
                lineTo(28.0f, 196.0f)
                lineTo(16.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(240.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(36.0f, 98.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.78f, -3.33f)
                lineToRelative(88.0f, -58.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, 0.0f)
                lineToRelative(88.0f, 58.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 98.67f)
                lineTo(220.0f, 196.0f)
                lineTo(188.0f, 196.0f)
                lineTo(188.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(72.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(60.0f)
                lineTo(36.0f, 196.0f)
                close()
                moveTo(180.0f, 140.0f)
                verticalLineToRelative(24.0f)
                lineTo(132.0f, 164.0f)
                lineTo(132.0f, 140.0f)
                close()
                moveTo(124.0f, 164.0f)
                lineTo(76.0f, 164.0f)
                lineTo(76.0f, 140.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(76.0f, 172.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                lineTo(76.0f, 196.0f)
                close()
                moveTo(132.0f, 172.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                lineTo(132.0f, 196.0f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
