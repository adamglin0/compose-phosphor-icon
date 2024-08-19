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

public val ThinGroup.Facemask: ImageVector
    get() {
        if (_facemask != null) {
            return _facemask!!
        }
        _facemask = Builder(name = "Facemask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 104.0f)
                close()
                moveTo(168.0f, 132.0f)
                lineTo(88.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(252.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineToRelative(-7.84f)
                curveToRelative(-6.41f, 16.0f, -20.74f, 29.76f, -42.37f, 40.58f)
                arcToRelative(187.14f, 187.14f, 0.0f, false, true, -45.07f, 15.36f)
                arcToRelative(4.35f, 4.35f, 0.0f, false, true, -1.44f, 0.0f)
                arcToRelative(187.14f, 187.14f, 0.0f, false, true, -45.07f, -15.36f)
                curveTo(60.58f, 185.76f, 46.25f, 172.0f, 39.84f, 156.0f)
                lineTo(32.0f, 156.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 4.0f, 128.0f)
                lineTo(4.0f, 104.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 32.0f, 76.0f)
                horizontalLineToRelative(4.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 43.9f, 65.81f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.2f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 219.94f, 76.0f)
                lineTo(224.0f, 76.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 252.0f, 104.0f)
                close()
                moveTo(37.35f, 148.0f)
                arcTo(53.71f, 53.71f, 0.0f, false, true, 36.0f, 136.0f)
                lineTo(36.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                close()
                moveTo(212.0f, 136.0f)
                lineTo(212.0f, 77.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, -3.76f)
                lineToRelative(-80.0f, -29.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.74f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 77.09f)
                lineTo(44.0f, 136.0f)
                curveToRelative(0.0f, 49.42f, 75.76f, 66.24f, 84.0f, 67.92f)
                curveTo(136.24f, 202.24f, 212.0f, 185.42f, 212.0f, 136.0f)
                close()
                moveTo(244.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(53.71f, 53.71f, 0.0f, false, true, -1.35f, 12.0f)
                lineTo(224.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _facemask!!
    }

private var _facemask: ImageVector? = null
