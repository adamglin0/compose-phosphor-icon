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

public val ThinGroup.Cloudfog: ImageVector
    get() {
        if (_cloudfog != null) {
            return _cloudfog!!
        }
        _cloudfog = Builder(name = "Cloudfog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(184.0f, 196.0f)
                lineTo(160.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(160.0f, 228.0f)
                lineTo(104.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 100.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                lineTo(76.0f, 172.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 87.51f, 77.39f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 228.0f, 100.0f)
                close()
                moveTo(220.0f, 100.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 92.0f, 96.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, -0.46f)
                arcToRelative(71.63f, 71.63f, 0.0f, false, true, 1.42f, -10.65f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 76.0f, 164.0f)
                horizontalLineToRelative(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 220.0f, 100.0f)
                close()
            }
        }
        .build()
        return _cloudfog!!
    }

private var _cloudfog: ImageVector? = null