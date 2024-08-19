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

public val ThinGroup.Chartlinedown: ImageVector
    get() {
        if (_chartlinedown != null) {
            return _chartlinedown!!
        }
        _chartlinedown = Builder(name = "Chartlinedown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineTo(62.34f)
                lineToRelative(60.0f, 60.0f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(196.0f, 158.34f)
                verticalLineTo(128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, true, -0.08f, 0.78f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, true, -0.1f, 0.34f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.13f, 0.41f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, -0.2f, 0.39f)
                curveToRelative(-0.05f, 0.1f, -0.1f, 0.2f, -0.16f, 0.3f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, -1.11f, 1.11f)
                lineToRelative(-0.31f, 0.16f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -0.38f, 0.2f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.41f, 0.13f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, true, -0.34f, 0.1f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, true, -0.78f, 0.08f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(30.34f)
                lineTo(128.0f, 101.66f)
                lineTo(98.83f, 130.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(36.0f, 73.66f)
                verticalLineTo(204.0f)
                horizontalLineTo(224.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartlinedown!!
    }

private var _chartlinedown: ImageVector? = null
