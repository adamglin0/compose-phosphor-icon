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

public val FillGroup.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) {
            return _patreonLogo!!
        }
        _patreonLogo = Builder(name = "PatreonLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 93.17f)
                curveToRelative(0.0f, 41.0f, -29.69f, 52.47f, -53.55f, 61.67f)
                curveToRelative(-8.41f, 3.24f, -16.35f, 6.3f, -22.21f, 10.28f)
                curveToRelative(-11.39f, 7.72f, -18.59f, 21.78f, -25.55f, 35.38f)
                curveToRelative(-9.94f, 19.42f, -20.23f, 39.5f, -43.17f, 39.5f)
                curveToRelative(-12.91f, 0.0f, -24.61f, -11.64f, -33.85f, -33.66f)
                reflectiveCurveToRelative(-14.31f, -51.0f, -13.61f, -77.45f)
                curveToRelative(1.08f, -40.65f, 14.58f, -62.68f, 25.7f, -74.0f)
                curveToRelative(14.95f, -15.2f, 35.24f, -25.3f, 58.68f, -29.2f)
                curveToRelative(21.79f, -3.62f, 44.14f, -1.38f, 62.93f, 6.3f)
                curveTo(215.73f, 43.6f, 232.0f, 65.9f, 232.0f, 93.17f)
                close()
            }
        }
        .build()
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
