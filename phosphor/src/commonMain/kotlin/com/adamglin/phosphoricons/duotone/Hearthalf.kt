package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Hearthalf: ImageVector
    get() {
        if (_hearthalf != null) {
            return _hearthalf!!
        }
        _hearthalf = Builder(name = "Hearthalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                verticalLineTo(224.0f)
                reflectiveCurveTo(24.0f, 168.0f, 24.0f, 102.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 78.0f, 48.0f)
                curveTo(100.59f, 48.0f, 119.94f, 60.31f, 128.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 40.0f)
                curveToRelative(-20.65f, 0.0f, -38.73f, 8.88f, -50.0f, 23.89f)
                curveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, -62.0f, 62.0f)
                curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f)
                curveTo(136.21f, 228.67f, 240.0f, 172.0f, 240.0f, 102.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 40.0f)
                close()
                moveTo(32.0f, 102.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 56.0f)
                curveToRelative(18.91f, 0.0f, 34.86f, 9.79f, 42.0f, 25.65f)
                verticalLineTo(210.0f)
                curveTo(93.59f, 193.44f, 32.0f, 149.78f, 32.0f, 102.0f)
                close()
                moveTo(136.0f, 210.0f)
                verticalLineTo(81.65f)
                curveTo(143.14f, 65.79f, 159.09f, 56.0f, 178.0f, 56.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f)
                curveTo(224.0f, 149.71f, 162.42f, 193.41f, 136.0f, 210.0f)
                close()
            }
        }
        .build()
        return _hearthalf!!
    }

private var _hearthalf: ImageVector? = null
