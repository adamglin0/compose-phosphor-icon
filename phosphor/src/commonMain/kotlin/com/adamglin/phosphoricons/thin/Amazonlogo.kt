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

public val ThinGroup.Amazonlogo: ImageVector
    get() {
        if (_amazonlogo != null) {
            return _amazonlogo!!
        }
        _amazonlogo = Builder(name = "Amazonlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(236.0f, 177.66f)
                lineToRelative(-9.1f, 9.1f)
                curveTo(224.52f, 189.37f, 188.3f, 228.0f, 128.0f, 228.0f)
                curveToRelative(-61.08f, 0.0f, -97.45f, -39.64f, -99.0f, -41.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 35.0f, 181.32f)
                curveToRelative(0.35f, 0.39f, 35.63f, 38.68f, 93.0f, 38.68f)
                reflectiveCurveToRelative(92.68f, -38.29f, 93.0f, -38.68f)
                lineToRelative(0.14f, -0.15f)
                lineToRelative(9.17f, -9.17f)
                lineTo(208.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 168.0f)
                close()
                moveTo(164.0f, 105.51f)
                lineTo(164.0f, 84.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 88.36f, 65.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.12f, -3.64f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 172.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(164.0f, 158.49f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -53.0f)
                close()
                moveTo(164.0f, 132.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 164.0f, 132.0f)
                close()
            }
        }
        .build()
        return _amazonlogo!!
    }

private var _amazonlogo: ImageVector? = null
