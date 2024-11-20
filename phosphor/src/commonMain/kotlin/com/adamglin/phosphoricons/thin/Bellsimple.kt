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

public val ThinGroup.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) {
            return _bellSimple!!
        }
        _bellSimple = Builder(name = "BellSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
                moveTo(218.38f, 190.0f)
                arcTo(11.84f, 11.84f, 0.0f, false, true, 208.0f, 196.0f)
                lineTo(48.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 37.65f, 178.0f)
                curveTo(43.42f, 168.0f, 52.0f, 140.13f, 52.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 152.0f, 0.0f)
                curveToRelative(0.0f, 36.13f, 8.59f, 64.0f, 14.36f, 73.95f)
                arcTo(11.92f, 11.92f, 0.0f, false, true, 218.38f, 190.0f)
                close()
                moveTo(211.43f, 182.0f)
                curveTo(204.0f, 169.17f, 196.0f, 139.31f, 196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 35.32f, -8.0f, 65.17f, -15.44f, 78.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(3.91f, 3.91f, 0.0f, false, false, 48.0f, 188.0f)
                lineTo(208.0f, 188.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 3.44f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.43f, 182.0f)
                close()
            }
        }
        .build()
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
