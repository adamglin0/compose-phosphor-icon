package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Hearthalf: ImageVector
    get() {
        if (_hearthalf != null) {
            return _hearthalf!!
        }
        _hearthalf = Builder(name = "Hearthalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(128.0f, 214.8f)
                verticalLineTo(104.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 41.61f, -47.56f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 178.0f, 56.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f)
                curveTo(224.0f, 155.61f, 146.25f, 204.15f, 128.0f, 214.8f)
                close()
            }
        }
        .build()
        return _hearthalf!!
    }

private var _hearthalf: ImageVector? = null
