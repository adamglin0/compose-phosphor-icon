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

public val LightGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.82f, 90.71f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, false, -5.64f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 10.58f)
                lineTo(34.0f, 116.67f)
                verticalLineToRelative(49.62f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.55f, 9.32f)
                curveTo(50.42f, 189.94f, 79.29f, 214.0f, 128.0f, 214.0f)
                arcToRelative(127.21f, 127.21f, 0.0f, false, false, 50.0f, -9.73f)
                lineTo(178.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(190.0f, 198.35f)
                arcToRelative(113.18f, 113.18f, 0.0f, false, false, 28.45f, -22.75f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, 3.55f, -9.31f)
                lineTo(222.0f, 116.67f)
                lineToRelative(28.82f, -15.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.58f)
                close()
                moveTo(128.0f, 202.0f)
                curveToRelative(-44.0f, 0.0f, -70.0f, -21.56f, -81.52f, -34.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.48f, -1.3f)
                lineTo(46.0f, 123.07f)
                lineToRelative(79.18f, 42.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, 0.0f)
                lineTo(178.0f, 140.13f)
                verticalLineToRelative(51.0f)
                curveTo(165.0f, 197.35f, 148.45f, 202.0f, 128.0f, 202.0f)
                close()
                moveTo(210.0f, 166.29f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.48f, 1.3f)
                arcTo(100.25f, 100.25f, 0.0f, false, true, 190.0f, 184.3f)
                lineTo(190.0f, 133.73f)
                lineToRelative(20.0f, -10.66f)
                close()
                moveTo(187.85f, 121.29f)
                arcToRelative(6.27f, 6.27f, 0.0f, false, false, -1.0f, -0.71f)
                lineToRelative(-56.0f, -29.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, 10.58f)
                lineTo(175.25f, 128.0f)
                lineTo(128.0f, 153.2f)
                lineTo(20.75f, 96.0f)
                lineTo(128.0f, 38.8f)
                lineTo(235.25f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
