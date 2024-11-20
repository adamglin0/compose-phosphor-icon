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

public val BoldGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 84.0f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(220.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                curveToRelative(-37.0f, 0.0f, -55.27f, -18.47f, -70.0f, -33.3f)
                curveToRelative(-1.71f, -1.72f, -3.36f, -3.4f, -5.0f, -5.0f)
                lineToRelative(-8.63f, 19.85f)
                lineTo(159.0f, 166.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.0f, 9.77f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(140.0f, 182.17f)
                lineToRelative(-25.37f, -18.12f)
                lineTo(83.0f, 236.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.0f, -9.57f)
                lineToRelative(50.06f, -115.13f)
                quadToRelative(-10.64f, 0.75f, -25.0f, 8.4f)
                arcToRelative(159.78f, 159.78f, 0.0f, false, false, -29.83f, 21.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.43f, -17.5f)
                curveToRelative(2.61f, -2.45f, 64.36f, -59.67f, 104.09f, -25.18f)
                curveToRelative(3.94f, 3.42f, 7.64f, 7.16f, 11.22f, 10.78f)
                curveTo(168.43f, 123.28f, 181.0f, 136.0f, 208.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 148.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
