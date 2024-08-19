package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Phone-disconnect-fill`: ImageVector
    get() {
        if (`_phone-disconnect-fill` != null) {
            return `_phone-disconnect-fill`!!
        }
        `_phone-disconnect-fill` = Builder(name = "Phone-disconnect-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.28f, 161.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.06f)
                lineToRelative(-49.0f, -17.39f)
                lineToRelative(-0.29f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.72f, -11.59f)
                lineToRelative(-6.21f, -29.75f)
                horizontalLineToRelative(0.0f)
                arcToRelative(76.52f, 76.52f, 0.0f, false, false, -49.68f, 0.11f)
                lineToRelative(-5.9f, 29.52f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.75f, 11.73f)
                lineToRelative(-0.29f, 0.11f)
                lineToRelative(-49.0f, 17.37f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 32.35f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.63f, -6.14f)
                curveToRelative(-17.23f, -22.22f, -15.3f, -51.71f, 4.69f, -71.71f)
                curveToRelative(56.15f, -56.17f, 151.0f, -56.17f, 207.18f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveTo(251.58f, 110.13f, 253.51f, 139.62f, 236.28f, 161.84f)
                close()
                moveTo(216.0f, 192.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_phone-disconnect-fill`!!
    }

private var `_phone-disconnect-fill`: ImageVector? = null
