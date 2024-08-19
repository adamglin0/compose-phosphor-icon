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

public val LightGroup.Pants: ImageVector
    get() {
        if (_pants != null) {
            return _pants!!
        }
        _pants = Builder(name = "Pants", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.89f, 214.26f)
                lineToRelative(-22.0f, -176.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 186.0f, 26.0f)
                lineTo(70.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.11f, 38.26f)
                lineToRelative(-22.0f, 176.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 230.0f)
                lineTo(88.69f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.57f, -10.56f)
                lineTo(128.0f, 120.0f)
                lineToRelative(25.73f, 99.44f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 167.31f, 230.0f)
                lineTo(208.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.89f, -15.74f)
                close()
                moveTo(195.22f, 97.66f)
                arcTo(34.07f, 34.07f, 0.0f, false, true, 166.54f, 70.0f)
                horizontalLineToRelative(25.23f)
                close()
                moveTo(70.0f, 38.0f)
                lineTo(186.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.75f)
                lineTo(190.27f, 58.0f)
                lineTo(65.73f, 58.0f)
                lineTo(68.0f, 39.75f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 70.0f, 38.0f)
                close()
                moveTo(64.23f, 70.0f)
                lineTo(89.46f, 70.0f)
                arcTo(34.07f, 34.07f, 0.0f, false, true, 60.78f, 97.66f)
                close()
                moveTo(90.63f, 216.49f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 88.69f, 218.0f)
                lineTo(48.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.25f)
                lineTo(59.25f, 109.87f)
                arcTo(46.07f, 46.07f, 0.0f, false, false, 101.6f, 70.0f)
                lineTo(122.0f, 70.0f)
                lineTo(122.0f, 95.24f)
                close()
                moveTo(209.5f, 217.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.5f, 0.68f)
                lineTo(167.31f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.95f, -1.56f)
                lineTo(134.0f, 95.24f)
                lineTo(134.0f, 70.0f)
                horizontalLineToRelative(20.4f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, false, 42.35f, 39.87f)
                lineTo(210.0f, 215.75f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.5f, 217.32f)
                close()
            }
        }
        .build()
        return _pants!!
    }

private var _pants: ImageVector? = null
