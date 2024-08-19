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

public val LightGroup.Listheart: ImageVector
    get() {
        if (_listheart != null) {
            return _listheart!!
        }
        _listheart = Builder(name = "Listheart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(216.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f)
                close()
                moveTo(40.0f, 134.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(120.0f, 186.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(246.0f, 144.0f)
                curveToRelative(0.0f, 35.3f, -49.22f, 60.32f, -51.32f, 61.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 0.0f)
                curveTo(187.22f, 204.32f, 138.0f, 179.3f, 138.0f, 144.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 54.0f, -18.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 54.0f, 18.0f)
                close()
                moveTo(234.0f, 144.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                curveToRelative(0.0f, 14.15f, 11.78f, 27.0f, 21.67f, 35.25f)
                arcTo(138.82f, 138.82f, 0.0f, false, false, 192.0f, 193.19f)
                arcToRelative(138.0f, 138.0f, 0.0f, false, false, 20.33f, -13.94f)
                curveTo(222.22f, 171.0f, 234.0f, 158.15f, 234.0f, 144.0f)
                close()
            }
        }
        .build()
        return _listheart!!
    }

private var _listheart: ImageVector? = null
