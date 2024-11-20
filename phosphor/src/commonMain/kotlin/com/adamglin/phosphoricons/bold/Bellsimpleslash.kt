package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) {
            return _bellSimpleSlash!!
        }
        _bellSimpleSlash = Builder(name = "BellSimpleSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.88f, 207.93f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineToRelative(14.8f, 16.29f)
                arcTo(83.58f, 83.58f, 0.0f, false, false, 44.0f, 104.0f)
                curveToRelative(0.0f, 25.58f, -4.59f, 47.0f, -13.27f, 61.93f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 30.68f, 186.0f)
                arcTo(19.75f, 19.75f, 0.0f, false, false, 48.0f, 196.0f)
                horizontalLineTo(173.6f)
                lineToRelative(25.52f, 28.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(54.68f, 172.0f)
                curveTo(63.52f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f)
                arcToRelative(59.84f, 59.84f, 0.0f, false, true, 3.52f, -20.29f)
                lineTo(151.78f, 172.0f)
                close()
                moveTo(172.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 224.0f)
                close()
                moveTo(88.89f, 42.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.37f, -15.73f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 104.0f)
                curveToRelative(0.0f, 18.68f, 2.38f, 34.93f, 7.07f, 48.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.64f, 8.0f)
                curveTo(190.83f, 144.32f, 188.0f, 125.4f, 188.0f, 104.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -83.38f, -55.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.89f, 42.35f)
                close()
            }
        }
        .build()
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
