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

public val ThinGroup.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) {
            return _behanceLogo!!
        }
        _behanceLogo = Builder(name = "BehanceLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.16f, 122.74f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 90.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(94.0f, 196.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 14.16f, -73.26f)
                close()
                moveTo(36.0f, 68.0f)
                lineTo(90.0f, 68.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                lineTo(36.0f, 120.0f)
                close()
                moveTo(94.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 128.0f)
                lineTo(94.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, 60.0f)
                close()
                moveTo(164.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(168.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
                moveTo(200.0f, 108.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 35.2f, 70.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.4f, -4.81f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 164.22f, 156.0f)
                lineTo(240.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 200.0f, 108.0f)
                close()
                moveTo(164.22f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 71.56f, 0.0f)
                close()
            }
        }
        .build()
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
