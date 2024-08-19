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

public val ThinGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.61f, 174.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 172.0f)
                lineTo(140.0f, 172.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -6.69f)
                lineTo(140.0f, 46.45f)
                lineTo(140.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.1f, -2.52f)
                lineToRelative(-104.0f, 128.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 140.0f)
                lineTo(132.0f, 140.0f)
                verticalLineToRelative(32.0f)
                lineTo(16.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.12f, 6.5f)
                lineToRelative(29.59f, 37.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, 4.5f)
                lineTo(204.16f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, -4.5f)
                lineToRelative(29.59f, -37.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.61f, 174.27f)
                close()
                moveTo(207.0f, 132.0f)
                lineTo(140.0f, 132.0f)
                lineTo(140.0f, 58.35f)
                close()
                moveTo(40.4f, 132.0f)
                lineTo(132.0f, 19.27f)
                lineTo(132.0f, 132.0f)
                close()
                moveTo(207.28f, 210.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.12f, 1.5f)
                lineTo(51.84f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.12f, -1.5f)
                lineTo(24.32f, 180.0f)
                lineTo(231.68f, 180.0f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
